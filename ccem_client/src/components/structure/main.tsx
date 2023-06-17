import React, { useState } from 'react';
import { FormControl, InputLabel, TextField, ButtonBase } from '@mui/material';
import Autocomplete from '@mui/material/Autocomplete';
import { Navigate } from 'react-router-dom';

function fetch_county(county) {
  if (county) {
    return true;
  }
  return false;
}

function Search() {
  const [search, setSearch] = useState('');
  const [success, setSuccess] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    let result = fetch_county(search);
    if (result) {
      setSuccess(true);
    }
    console.log(result);
    console.log('Handling Request');
  };

  const handleSearchChange = (event, value) => {
    setSearch(value);
  };

  const options = ['banana1', 'ban2', 'banana3'];

  const filteredOptions = options.filter((option) =>
    option.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <>
      <FormControl component="form" onSubmit={handleSubmit}>
        <InputLabel htmlFor="searchPlace"></InputLabel>
        <Autocomplete
          disablePortal
          id="searchPlace"
          options={filteredOptions}
          value={search}
          onChange={handleSearchChange}
          sx={{ width: 300 }}
          renderInput={(params) => (
            <TextField {...params} label="Search" />
          )}
        />

        <ButtonBase type="submit">Submit</ButtonBase>
      </FormControl>
      {success && <Navigate to={`/${search}`} replace={true} />}
    </>
  );
}

export default function Main() {
  return (
    <div className="main">
      <Search />
    </div>
  );
}

